package com.zbogdan.services

import com.zbogdan.models.Model
import javax.persistence.EntityManager

abstract class Service<T : Model>(private val entityClass: Class<T>) {

    protected abstract val entityManager: EntityManager

    open fun all(): List<T> {
        val query = entityManager.criteriaBuilder.createQuery()
        query.select(query.from(entityClass))
        return entityManager.createQuery(query).resultList as List<T>
    }

    open fun find(id: Int): T = entityManager.find(entityClass, id)

    open fun create(t: T): Unit = entityManager.persist(t)

    open fun update(t: T): Unit {
        entityManager.merge(t)
    }

    open fun delete(t: T): Unit = entityManager.remove(t)
}