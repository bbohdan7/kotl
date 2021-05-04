package com.zbogdan.models

import java.io.Serializable
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "payments")
data class Payment(
    @ManyToOne
    @JoinColumn(name = "source_user_id", referencedColumnName = "id")
    var sender: User? = null,

    @ManyToOne
    @JoinColumn(name = "destination_user_id", referencedColumnName = "id")
    var recipient: User? = null,

    @ManyToOne
    @JoinColumn(name = "source_account_id", referencedColumnName = "id")
    var senderAccount: Account? = null,

    @ManyToOne
    @JoinColumn(name = "destination_account_id", referencedColumnName = "id")
    var recipientAccount: Account? = null,

    @Column(name = "amount")
    var amount: Float? = null,

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "transaction_date")
    var transactionDate: Date? = null

) : Model(){
    override fun toString(): String {
        return "Payment(amount=$amount, transactionDate=$transactionDate)"
    }
}