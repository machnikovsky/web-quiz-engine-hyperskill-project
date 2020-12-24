package engine.repository;

import engine.model.Account;
import engine.model.QuizQuestion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

//    @Query("SELECT u.completedQuestions FROM Account u WHERE u.email = :email")
//    Page<QuizQuestion> findAllCompletedQuestions(Pageable pageable, @Param("email") String email);

    public Optional<Account> findAccountByEmail(String email);
}
