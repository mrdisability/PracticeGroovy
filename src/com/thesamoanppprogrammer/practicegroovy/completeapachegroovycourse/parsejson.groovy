package com.thesamoanppprogrammer.practicegroovy.completeapachegroovycourse

import groovy.json.JsonSlurper

//def todos = '''
//{
//    "todos": {
//        "currentTodo": {
//            "todo": "First Todo",
//            "completed": false
//        },
//        "nextTodo": {
//            "todo": "Second Todo",
//            "completed": false
//        }
//    }
//}
//'''
//
//JsonSlurper jsonSlurper = new JsonSlurper()
//def json = jsonSlurper.parseText(todos)
//
//println json
//println json.todos.nextTodo.todo

JsonSlurper jsonSlurper = new JsonSlurper()
def json = jsonSlurper.parse(new File("data/todos.json"))

println json.todos.currentTodo.todo
println json.todos.nextTodo
