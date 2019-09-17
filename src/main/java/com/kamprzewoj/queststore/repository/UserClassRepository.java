package com.kamprzewoj.queststore.repository;

import com.kamprzewoj.queststore.model.UserClass;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//todo Spring MVC       http://localhost:8080/api/UserClass/115
@Repository("UserClassRepository")
public interface UserClassRepository extends CrudRepository<UserClass, Long> {
//	Optional<UserClass> findByNameAnd(String name);
//	Optional<UserClass> findByPhotoUrl(String photoUrl);
	Optional<UserClass> deleteByName(String name);

//todo	@Repository("UserClassRepository")
//todo	default <S extends UserClass> S save(S s) {
//todo	default <S extends UserClass> Iterable<S> saveAll(Iterable<S> iterable) {
//todo	default Optional<UserClass> findById(Integer integer) {
//todo	default boolean existsById(Integer integer) {
//todo	default Iterable<UserClass> findAll() {
//todo	default Iterable<UserClass> findAllById(Iterable<Integer> iterable) {
//todo	default long count() {
//todo	default void deleteById(Integer integer) {
//todo	default void delete(UserClass userClass) {
//todo	default void deleteAll(Iterable<? extends UserClass> iterable) {
//todo	default void deleteAll() {
}
