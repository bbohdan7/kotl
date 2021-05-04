package com.zbogdan.models

import javax.persistence.*

@Entity
@Table(name = "accounts")
data class Account(
    @Column(name = "balance")
    var balance: Float? = null,

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    var user: User? = null
) : Model() {
    override fun toString(): String {
        return "Account(balance=$balance)"
    }
}