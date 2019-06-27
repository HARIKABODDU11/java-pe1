package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class AppTest {
    App app;
    @Before
    public void setUp(){
        System.out.println("Before");
        app =new App();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        app=null;
    }

    @BeforeClass
    public static void setUpBeforeClass(){
        System.out.println("BeforeClass");
    }
    @AfterClass
    public static void tearDownAfterClass(){
        System.out.println("AfterClass");

    }
    @Test
     public void givenTwoNullShouldReturnErrorMessage(){
        //Arrange

        //Act
        String result=app.concatAndConvertString(null,null);
        //Assert
        assertEquals("Null not allowed",result);
   }
    @Test
    public void givenOneEmptyStringOneNumericStringReturnNumericString(){
        //Arrange

        //Act
        String result=app.concatAndConvertString("","5");
        //Assert
        assertEquals("5",result);
    }
     }

