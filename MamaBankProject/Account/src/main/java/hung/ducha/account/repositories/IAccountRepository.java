package hung.ducha.account.repositories;

import hung.ducha.account.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IAccountRepository extends JpaRepository<Account, Long> {
}
