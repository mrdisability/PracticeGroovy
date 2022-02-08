package com.thesamoanppprogrammer.practicegroovy.completeapachegroovycourse

import groovy.xml.MarkupBuilder

MarkupBuilder markupBuilder = new MarkupBuilder()

markupBuilder.sports {
    sport(id:1) {
        name: 'Rugby'
    }
    sport(id:2) {
        name: 'Soccer'
    }
    sport(id:3) {
        name: 'Golf'
    }
}

