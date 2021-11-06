package com.example.swipe_to_do.Model

class Task(name: String, description: String, color: Int) {
    var name = name
        get() {return field}
        set(value) {field = value}

    var description = description
        get() {return field}
        set(value) {field = value}

    var color = color
        get() {return field}
        set(value) {field = value}


}