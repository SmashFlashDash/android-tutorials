package ua.cn.stu.tests.data.accounts.entities

import ua.cn.stu.tests.domain.accounts.entities.Account

/**
 * Response body for `GET /me` HTTP-request.
 *
 * JSON example:
 * ```
 * {
 *   "id": 0,
 *   "email": "",
 *   "username": "",
 *   "createdAt": 0
 * }
 * ```
 */
data class GetAccountResponseEntity(
    val id: Long,
    val email: String,
    val username: String,
    val createdAt: Long
) {

    /**
     * Convert this entity into in-app [Account] instance.
     */
    fun toAccount(): Account = Account(
        id = id,
        email = email,
        username = username,
        createdAt = createdAt
    )
}