package com.thesamoanppprogrammer.practicegroovy.restapi.httpbuilder

import groovyx.net.http.HTTPBuilder
import static groovyx.net.http.ContentType.URLENC

def http = new HTTPBuilder( 'https://61e281e83050a100176821ca.mockapi.io' )
def postBody = [todo: 'Groovy Todo', completed: true] // will be url-encoded

http.post( path: '/todos', body: postBody,
        requestContentType: URLENC ) { resp ->

    println "POST Success: ${resp.statusLine}"
    assert resp.statusLine.statusCode == 201
}

