package com.journaler.api.security

import java.util.*
import javax.persistence.DiscriminatorValue
import javax.persistence.Entity

@Entity
@DiscriminatorValue(value = "MEMBER")
class Member(id: String,
             email: String,
             pwd: String,
             firstName: String,
             lastName: String,
             roles: String,
             enabled: Boolean,
             accountNonExpired: Boolean,
             accountNonLocked: Boolean,
             credentialNonExpired: Boolean,
             created: Date,
             modified: Date
): User(
    id,
    email,
    pwd,
    firstName,
    lastName,
    roles,
    enabled,
    accountNonExpired,
    accountNonLocked,
    credentialNonExpired,
    created,
    modified
) {
    constructor() : this(
        "", "", "", "", "", "", true, true, true, true, Date(), Date()
    )
}