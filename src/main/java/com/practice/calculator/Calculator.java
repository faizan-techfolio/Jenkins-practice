{\rtf1\ansi\ansicpg1252\cocoartf2870
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 package com.practice.calculator;\
\
public class Calculator \{\
\
    public int add(int a, int b) \{\
        return a + b;\
    \}\
\
    public int subtract(int a, int b) \{\
        return a - b;\
    \}\
\
    public int multiply(int a, int b) \{\
        return a * b;\
    \}\
\
    public double divide(int a, int b) \{\
        if (b == 0) \{\
            throw new IllegalArgumentException("Cannot divide by zero");\
        \}\
        return (double) a / b;\
    \}\
\
    public static void main(String[] args) \{\
        Calculator calc = new Calculator();\
        System.out.println("2 + 3 = " + calc.add(2, 3));\
        System.out.println("5 - 2 = " + calc.subtract(5, 2));\
        System.out.println("4 * 6 = " + calc.multiply(4, 6));\
        System.out.println("10 / 4 = " + calc.divide(10, 4));\
    \}\
\}}