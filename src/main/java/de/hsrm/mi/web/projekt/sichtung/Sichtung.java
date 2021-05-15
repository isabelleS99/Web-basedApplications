package de.hsrm.mi.web.projekt.sichtung;

import java.time.LocalDate;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import de.hsrm.mi.web.projekt.validierung.Siebzehnhaft;

public class Sichtung {
    
    @Size(min=3)
    @NotBlank
    private String name;
    
    @NotBlank
    private String ort;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull
    private LocalDate datum;

    @Size(min = 0, max = 80)
    @NotBlank 
    @Siebzehnhaft(message = "Hier ist leider keine 17 erwähnt")
    private String beschreibung;
    
    public Sichtung(String name, String ort, LocalDate datum, String beschreibung) {
        this.name = name;
        this.ort = ort;
        this.beschreibung = beschreibung;
        this.datum = datum;
    }

    public Sichtung(){
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getOrt() {
        return ort;
    }
    public void setOrt(String ort) {
        this.ort = ort;
    }
    public LocalDate getDatum() {
        return datum;
    }
    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }
    public String getBeschreibung() {
        return beschreibung;
    }
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }
    @Override
    public String toString() {
        return "Sichtung [beschreibung=" + beschreibung + ", datum=" + datum + ", name=" + name + ", ort=" + ort + "]";
    }
    
}
