{\rtf1\ansi\ansicpg1252\cocoartf2870
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww28600\viewh17280\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 package com.practice.calculator;\
\
import org.junit.jupiter.api.Test;\
import static org.junit.jupiter.api.Assertions.*;\
\
class CalculatorTest \{\
\
    private final Calculator calc = new Calculator();\
\
    @Test\
    void testAdd() \{\
        assertEquals(5, calc.add(2, 3));\
    \}\
\
    @Test\
    void testSubtract() \{\
        assertEquals(3, calc.subtract(5, 2));\
    \}\
\
    @Test\
    void testMultiply() \{\
        assertEquals(24, calc.multiply(4, 6));\
    \}\
\
    @Test\
    void testDivide() \{\
        assertEquals(2.5, calc.divide(10, 4), 0.0001);\
    \}\
\
    @Test\
    void testDivideByZeroThrows() \{\
        assertThrows(IllegalArgumentException.class, () -> calc.divide(10, 0));\
    \}\
\}}