package com.simplepersoncrud;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class PersonTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private SessionFactory sessionFactory;

    @Test
    public void testDependencyInjection(){
        Assert.notNull(sessionFactory);
    }
}
