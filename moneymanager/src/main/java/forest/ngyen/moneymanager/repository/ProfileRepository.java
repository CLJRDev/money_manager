package forest.ngyen.moneymanager.repository;

import forest.ngyen.moneymanager.entity.ProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProfileRepository extends JpaRepository<ProfileEntity, Long> {

    //SELECT * FROM tbl_profile WHERE email = ?
    Optional<ProfileEntity> findByEmail(String email);

}
