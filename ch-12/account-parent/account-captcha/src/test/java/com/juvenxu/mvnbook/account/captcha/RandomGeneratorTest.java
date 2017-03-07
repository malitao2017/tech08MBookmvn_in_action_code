package com.juvenxu.mvnbook.account.captcha;

import static org.junit.Assert.assertFalse;

import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.junit.Test;

public class RandomGeneratorTest
{
    @Test
    public void testGetRandomString()
        throws Exception
    {

        DefaultKaptcha producer;
        producer = new DefaultKaptcha();
        producer.setConfig( new Config( new Properties() ) );
        String te = producer.createText();
        System.out.println(te);


        Set<String> randoms = new HashSet<String>( 100 );

        for ( int i = 0; i < 100; i++ )
        {
            String random = RandomGenerator.getRandomString();

            assertFalse( randoms.contains( random ) );

            randoms.add( random );
        }
    }
}
