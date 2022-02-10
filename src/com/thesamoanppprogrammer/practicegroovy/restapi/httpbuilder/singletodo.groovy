package com.thesamoanppprogrammer.practicegroovy.restapi.httpbuilder

import groovyx.net.http.ContentType
import groovyx.net.http.HTTPBuilder
import groovyx.net.http.Method

//import groovyx.net.http.ContentType
//import groovyx.net.http.RESTClient
//
//String base = 'https://61e281e83050a100176821ca.mockapi.io'
//
//def client = new RESTClient(base)
////def params = [firstName: "Dan", lastName: "Vega"]
//
//client.contentType = ContentType.JSON
//client.get( path: '/todos/17') { response, json ->
//    println response.status
//    println json
//}

def http = new HTTPBuilder()

http.request( 'https://61e281e83050a100176821ca.mockapi.io', Method.GET,
        ContentType.TEXT) { req ->
    uri.path = '/todos/17'
    //uri.query = [ v:'1.0', q: 'Calvin and Hobbes' ]
    headers.'User-Agent' = "Mozilla/5.0 Firefox/3.0.4"
    headers.Accept = 'application/json'

    response.success = { resp, reader ->
        assert resp.statusLine.statusCode == 200
        println "Got response: ${resp.statusLine}"
        println "Content-Type: ${resp.headers.'Content-Type'}"
        println reader.text
    }

    response.'404' = {
        println 'Not found'
    }
}

