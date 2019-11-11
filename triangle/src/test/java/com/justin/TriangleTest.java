package com.justin;

import org.junit.Test;
import java.lang.Math;
import static org.junit.Assert.*;
import java.lang.System;
import java.io.*;
import java.util.*;
import java.text.*;
/**
 * Unit test for simple App.
 */
public class TriangleTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void testPoint(){
        Point p1 = new Point();
       
        assertTrue(true);
    }
    @Test
    public void testPointX(){
        Point p1 = new Point(10,20);
        assertEquals(10.00, p1.getX(), 0.01);
    }
    @Test
    public void testPointY(){
        Point p1 = new Point(10,20);
        assertEquals(20.00, p1.getY(), 0.01);
    }

    @Test
    public void testCheckTriangleFalse() {
        
        Triangle tri = new Triangle(10, 20, 30);
        assertEquals(false, tri.checkTriangle());
    }
    @Test
    public void testCheckTriangleFalse1() {
        
        Triangle tri = new Triangle(-1, 20, 30);
        assertEquals(false, tri.checkTriangle());
    }
    @Test
    public void testCheckTriangleFalse2() {
        
        Triangle tri = new Triangle(1, 20, 30);
        assertEquals(false, tri.checkTriangle());
    }
    @Test
    public void testCheckTriangleFalse3() {
        
        Triangle tri = new Triangle(1, -2, 30);
        assertEquals(false, tri.checkTriangle());
    }
    @Test
    public void testCheckTriangleFalse4() {
        
        Triangle tri = new Triangle(1, 20, -30);
        assertEquals(false, tri.checkTriangle());
    }
    @Test
    public void testCheckTriangleFalse5() {
        
        Triangle tri = new Triangle(20 , 1, 30);
        assertEquals(false, tri.checkTriangle());
    }
    @Test
    public void testCheckTriangleFalse6() {
        
        Triangle tri = new Triangle(20 , 30, 1);
        assertEquals(false, tri.checkTriangle());
    }
    @Test
    public void testCheckTriangleFalse7() {
        
        Triangle tri = new Triangle(30 , 20, 1);
        assertEquals(false, tri.checkTriangle());
    }
    @Test
    public void testCheckTriangleTrue() {

        assertEquals(true, new Triangle(3, 4, 5).checkTriangle());
    }

    @Test
    public void testGetArea(){
        Double testArea = new Triangle(3,4,5).getArea();
        double s = (3 + 4 + 5) / 2;
        double area = Math.sqrt( s * ( s - 3) * ( s - 4) * (s - 5 ));
        assertEquals(area, testArea, 0.001);
    }

    @Test
    public void testSetTriangletype(){
        Triangle tri = new Triangle(3, 4, 5);
        tri.setTriangleBySide();
        assertEquals("Right and Scalene", tri.getTypeBySide());
    }
    @Test
    public void testSetTriangletype2(){
        Triangle tri = new Triangle(2, 2, 2);
        tri.setTriangleBySide();
        assertEquals("Equilateral", tri.getTypeBySide());
    }
    @Test
    public void testSetTriangletype3(){
        Triangle tri = new Triangle(2, 2, 3);
        tri.setTriangleBySide();
        assertEquals("Isosceles", tri.getTypeBySide());
    }
    @Test
    public void testSetTriangletype4(){
        Triangle tri = new Triangle(3, 2, 2);
        tri.setTriangleBySide();
        assertEquals("Isosceles", tri.getTypeBySide());
    }
    @Test
    public void testSetTriangletype5(){
        Triangle tri = new Triangle(3, 2, 3);
        tri.setTriangleBySide();
        assertEquals("Isosceles", tri.getTypeBySide());
    }

    //point triangle
    @Test
    public void testPointTriangle(){
        Point p1 = new Point(1, 2);
        Point p2 = new Point(0, 2);
        Point p3 = new Point(2, 0);
        Triangle tri =  new Triangle(p1,p2,p3);
        assertEquals(false, tri.checkTriangle());
    }
    // test main
    //test using 1
    @Test
    public void testMain1()  throws Exception {
        try {
        Triangle.main(new String[] {"test1.txt"});
       
        assertTrue(true);
        } 
        catch (Exception e){
            System.out.println("File not found");
            assertTrue(false);
        }
    }
    @Test
    public void testMain1error()  throws Exception {
        try {
        Triangle.main(new String[] {"tes.txt"});
       
        assertTrue(true);
        } 
        catch (Exception e){
            System.out.println("File not found");
            assertTrue(false);
        }
    }
    @Test
    public void testMain2()  throws Exception {
        try {
        Triangle.main(new String[] {"test2.txt"});
       
        assertTrue(true);
        } 
        catch (Exception e){
            System.out.println("File not found");
            assertTrue(false);
        }
    }
    @Test
    public void testMain3()  throws Exception {
        try {
        Triangle.main(new String[] {"test3.txt"});
       
        assertTrue(true);
        } 
        catch (Exception e){
            System.out.println("File not found");
            assertTrue(false);
        }
    }
    @Test
    public void testMain4()  throws Exception {
        try {
        Triangle.main(new String[] {"test4.txt"});
       
        assertTrue(true);
        } 
        catch (Exception e){
            System.out.println("File not found");
            assertTrue(false);
        }
    }
    @Test
    public void testMain5()  throws Exception {
        try {
        Triangle.main(new String[] {"test5.txt"});
       
        assertTrue(true);
        } 
        catch (Exception e){
            System.out.println("File not found");
            assertTrue(false);
        }
    }
    @Test
    public void testMain6()  throws Exception {
        try {
        Triangle.main(new String[] {"test6.txt"});
       
        assertTrue(true);
        } 
        catch (Exception e){
            System.out.println("File not found");
            assertTrue(false);
        }
    }
}
