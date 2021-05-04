package com.zbogdan.services

import com.zbogdan.models.User
import javax.ejb.Stateless
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Stateless
open class UserService : Service<User>(User::class.java) {
    @PersistenceContext(unitName = "PaymentDS")
    override lateinit var entityManager: EntityManager
}