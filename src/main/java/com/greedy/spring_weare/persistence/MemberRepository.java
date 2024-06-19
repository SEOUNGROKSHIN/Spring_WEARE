package com.greedy.spring_weare.persistence;

import com.greedy.spring_weare.domain.Member;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, Long>, QuerydslPredicateExecutor<Member> {



}
