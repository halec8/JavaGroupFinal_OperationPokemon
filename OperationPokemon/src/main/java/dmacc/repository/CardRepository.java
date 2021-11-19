package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Card;

/**
 * @author Austin Donald - ajdonald
 * CIS175 - Fall 2021
 * Nov 18, 2021
 */
@Repository
public interface CardRepository extends JpaRepository <Card, Long>{

}
