package com.zbogdan.models

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "users")
data class User(
    @Column(name = "firstname")
    var firstname: String? = null,

    @Column(name = "lastname")
    var lastname: String? = null,

    @Column(name = "email")
    var email: String? = null,

    @OneToMany(mappedBy = "user")
    var accounts: List<Account>? = null,

    @OneToMany(mappedBy = "sender")
    var payments: List<Payment>? = null
) : Model()