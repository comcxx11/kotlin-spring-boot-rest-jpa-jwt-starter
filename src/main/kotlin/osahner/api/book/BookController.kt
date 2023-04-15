package osahner.api.book

import org.springframework.web.bind.annotation.*
import osahner.domain.Book
import osahner.service.BookRepository

@RestController
@RequestMapping("/api/v1/books")
class BookController(private val repository: BookRepository) {
  @GetMapping(value = ["", "/"])
  fun findAll() = repository.findAll()

  @GetMapping("/{id}")
  fun findById(@PathVariable id: Long) = repository.findById(id)

  @PostMapping("/")
  fun create(@RequestBody book: Book) = repository.save(book)

  @PutMapping("/{id}")
  fun update(@PathVariable id: Long, @RequestBody book:Book) {
    assert(id == book.id)
    repository.save(book)
  }

  @DeleteMapping("/{id}")
  fun delete(@PathVariable id: Long) = repository.deleteById(id)
}
