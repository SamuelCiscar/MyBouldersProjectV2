package com.example.mybouldersproject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository                                    //<Bean, Typage Id>
public interface ContactRepository extends JpaRepository<ContactBean, Long> {

}
