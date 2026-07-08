package com.example.Spring_Email_Security.service;


import com.example.Spring_Email_Security.dto.role.RoleRequestDTO;
import com.example.Spring_Email_Security.dto.role.RoleResponceDTO;

import java.util.List;

public interface Role_Servies {
    RoleResponceDTO createRole(RoleRequestDTO dto);
    RoleResponceDTO getData(Long id);
    List<RoleResponceDTO> getAllRole();
    RoleResponceDTO updateRoel(Long id, RoleRequestDTO roleRequestDTO);
    String deleteRole(Long id);
}
