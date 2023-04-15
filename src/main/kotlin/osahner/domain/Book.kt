package osahner.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Book(
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  var id: Long? = null,
  var title: String,
  var author: String,
  var publicationYear: Int
)
