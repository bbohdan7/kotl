package com.zbogdan

import com.zbogdan.services.UserService
import javax.annotation.PostConstruct
import javax.ejb.Singleton
import javax.ejb.Startup
import javax.inject.Inject

@Startup
@Singleton
open class HomeController {

    @Inject
    private lateinit var usrService: UserService

    @PostConstruct
    open fun init(): Unit {
        println("Printing all of the users")
        usrService.all().forEach(System.out::println)
    }
}