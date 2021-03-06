package com.zbogdan

import com.zbogdan.models.User
import com.zbogdan.services.UserService
import javax.annotation.PostConstruct
import javax.ejb.Stateless
import javax.inject.Inject
import javax.inject.Named

@Named
@Stateless
open class HomeController {

    @Inject
    private lateinit var usrService: UserService

    @PostConstruct
    open fun init(): Unit {
        println("Printing all of the users' accounts")
        usrService.all().map(User::accounts).forEach(System.out::println)
    }

    open fun getUsers(): List<User> {
        return usrService.all();
    }
}