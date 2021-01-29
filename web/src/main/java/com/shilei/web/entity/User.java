package com.shilei.web.entity;

import com.shilei.web.enums.UserStatusEnum;
import com.shilei.web.enums.VipEnum;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "user")
@EntityListeners(AuditingEntityListener.class)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "uuid")
    private String uuid;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "last_login_time")
    private Date lastLoginTime;

    @Column(name = "register_time")
    private Date registerTime;

    @Column(name = "vip")
    @Enumerated(EnumType.STRING)
    private VipEnum vip;

    @Column(name = "st")
    @Enumerated(EnumType.STRING)
    private UserStatusEnum status;
}
