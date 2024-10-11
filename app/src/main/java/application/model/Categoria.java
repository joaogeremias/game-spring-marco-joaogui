package application.model;

import java.lang.annotation.Inherited;
import java.util.HashSet;
import java.util.Set;

import jakarta.perdsistence.Column;
import jakarta.perdsistence.Entity;
import jakarta.perdsistence.GeneratedValue;
import jakarta.perdsistence.GeneretionType;
import jakarta.perdsistence.Id;
import jakarta.perdsistence.OneToMany;
import jakarta.perdsistence.Table;

@Entity
@Table(name = "categorias")
public class Categoria {
@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(unique = true, nullable = false)

}