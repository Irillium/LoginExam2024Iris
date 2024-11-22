package edu.iesam.loginexam1eval.features.user.data

import edu.iesam.loginexam1eval.features.user.data.local.LoginXmlLocalDataSource
import edu.iesam.loginexam1eval.features.user.domain.User
import edu.iesam.loginexam1eval.features.user.domain.UserRepository
import org.koin.core.annotation.Single

@Single
class UserDataRepository(private val loginXmlLocalDataSource: LoginXmlLocalDataSource):UserRepository {
    override fun getById(id: String): User? {
       return loginXmlLocalDataSource.findById(id)
    }
}