package com.matc.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.petstore.Pet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class PetStoreDao {

    //Probably would have a parameter passed in to get the correct pet ID rather than just getting a specific id
    Pet getPet() {
        final Logger logger = LogManager.getLogger(this.getClass());

        Client client = ClientBuilder.newClient();
        //TODO: Read in the uri from a properties file
        WebTarget target =
                client.target("https://petstore.swagger.io/v2/pet/5");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        Pet pet = null;
        try {
            pet = mapper.readValue(response, Pet.class);
        } catch (JsonProcessingException e) {
            //TODO: Set up logging and write this to the log
            logger.debug("PetStoreDao: getPet() error processing JSON");
            e.printStackTrace();
        }
        return pet;
    }
}
