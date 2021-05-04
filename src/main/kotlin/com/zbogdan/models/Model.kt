package com.zbogdan.models

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class Model(
    @Id
    @Column(name = "id")
    var id: Int? = null
) : Serializable