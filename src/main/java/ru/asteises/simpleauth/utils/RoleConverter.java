//package ru.asteises.simpleauth.utils;
//
//import jakarta.persistence.AttributeConverter;
//import jakarta.persistence.Converter;
//import ru.asteises.simpleauth.model.Role;
//
//import java.util.stream.Stream;
//
//@Converter(autoApply = true)
//public class RoleConverter implements AttributeConverter<Role, String> {
////
////    @Override
////    public String convertToDatabaseColumn(Role role) {
////        return role.getValue();
////    }
////
////    @Override
////    public Role convertToEntityAttribute(String dbData) {
////        return Stream.of(Role.values())
////                .filter(r -> r.getValue().equals(dbData))
////                .findFirst().orElseThrow(IllegalArgumentException::new);
////    }
//}
