package com.thesamoanppprogrammer.practicegroovy.completeapachegroovycourse

import groovy.xml.XmlSlurper

//def xml = '''
//    <todos>
//        <todo>
//            <todo>First Todo</todo>
//            <completed>false</completed>
//        </todo>
//    </todos>
//'''
//
//def todos = new XmlSlurper().parseText(xml)
//
//println todos.getClass().getName()
//println todos.todo.todo

//Parse todos.xml file
def todos = new XmlSlurper().parse("data/todos.xml")

println todos
println todos.todo[2].todo

