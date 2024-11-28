package org.ldv.savonapi.model.dao

import org.ldv.savonapi.model.entity.Mention
import org.springframework.data.jpa.repository.JpaRepository

interface MentionDAO:JpaRepository<org.ldv.savonapi.model.entity.Mention,Long> {
}