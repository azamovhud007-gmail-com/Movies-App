package com.azmovhudstc.recycleviewlesson.model

class Movie {
    var image=0;
    var name=""
    var views=""
    var date=""

    constructor(image: Int, name: String, views: String, date: String) {
        this.image = image
        this.name = name
        this.views = views
        this.date = date
    }
}