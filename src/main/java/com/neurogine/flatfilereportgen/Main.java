package com.neurogine.flatfilereportgen;

import org.beanio.BeanWriter;
import org.beanio.StreamFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StreamFactory factory = StreamFactory.newInstance();
        factory.loadResource("mapping.xml");

        BeanWriter out = null;
        try {
            out = factory.createWriter("flatFile", new FileWriter("test.TXT"));

            // Write Header
            Header header = new Header();
            out.write(header);

            // Write Body
            List<Body> bodies = Arrays.asList(new Body("6813162459,", "RM2.00"), new Body("2039229524", "RM10.00"), new Body("2299488320", "RM5.00"));
            for (Body body : bodies) {
                out.write(body);
            }

            // Write Trailer
            Trailer trailer = new Trailer();
            out.write(trailer);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.flush();
                out.close();
            }
        }
    }

    public static List<Body> generateData() {
        return Arrays.asList(new Body("6813162459", "RM2.00"), new Body("2039229524", "RM10.00"), new Body("2299488320", "RM5.00"));
    }
}