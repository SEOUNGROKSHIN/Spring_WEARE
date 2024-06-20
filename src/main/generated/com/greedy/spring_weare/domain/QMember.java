package com.greedy.spring_weare.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = 574459819L;

    public static final QMember member = new QMember("member1");

    public final StringPath address = createString("address");

    public final StringPath email = createString("email");

    public final StringPath id = createString("id");

    public final NumberPath<Long> mno = createNumber("mno", Long.class);

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    public final StringPath phone = createString("phone");

    public final DateTimePath<java.sql.Timestamp> regdate = createDateTime("regdate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> updatedate = createDateTime("updatedate", java.sql.Timestamp.class);

    public QMember(String variable) {
        super(Member.class, forVariable(variable));
    }

    public QMember(Path<? extends Member> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMember(PathMetadata metadata) {
        super(Member.class, metadata);
    }

}

