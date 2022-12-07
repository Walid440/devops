package tn.esprit.spring;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.mock.mockito.MockBean;

import tn.esprit.spring.entities.Voyage;
import tn.esprit.spring.repository.VoyageRepository;
import tn.esprit.spring.services.VoyageServiceImpl;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
@ExtendWith(MockitoExtension.class)
 class MockTestVoyage {
	@InjectMocks
	private VoyageServiceImpl voyageServiceImpl;
	
	@Mock
	private VoyageRepository repository;
	
	@Test 
	public void addVoyage() {
		Voyage voyage=new Voyage();
		when(repository.save(voyage)).thenReturn(voyage);
		assertEquals(voyage, voyageServiceImpl.ajouterVoyage(voyage));
	}
	@Test
	public void  cancelVoyage() {
	Voyage voyage=new Voyage();
	Voyage voyage2=new Voyage();
	voyageServiceImpl.supprimerVoyage(voyage);
	voyageServiceImpl.supprimerVoyage(voyage2);
	verify(repository).delete(voyage);
	verify(repository).delete(voyage2);
	}
	
	@Test
	public void getAll() {
		when(repository.findAll()).thenReturn(Stream.of(new Voyage(),new Voyage()).collect(Collectors.toList()));
		assertEquals(2, voyageServiceImpl.recupererAll());
	}
	@Test
	public void getVoyage() {
		Voyage voyage=new Voyage();
		when(repository.findById(voyage.getIdVoyage())).thenReturn(Optional.of(voyage));
		assertEquals(voyage.getIdVoyage(), voyageServiceImpl.recupererVoyageParId(voyage.getIdVoyage()).getIdVoyage());
	}
	
	

}
