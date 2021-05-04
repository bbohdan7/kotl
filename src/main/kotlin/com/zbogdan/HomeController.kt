package com.zbogdan

import com.zbogdan.models.User
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
        println("Printing all of the users' accounts")
        usrService.all().map(User::accounts).forEach(System.out::println)
    }
}