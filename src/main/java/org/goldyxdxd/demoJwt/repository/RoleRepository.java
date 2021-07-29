package org.goldyxdxd.demoJwt.repository;

import org.goldyxdxd.demoJwt.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
