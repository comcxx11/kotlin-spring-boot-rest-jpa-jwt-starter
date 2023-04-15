package osahner.service

import org.springframework.data.jpa.repository.JpaRepository
import osahner.domain.Book

interface BookRepository: JpaRepository<Book, Long> {
}
