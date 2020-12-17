package io.arsh.portfolio.onileservicetracker.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Online_Service")
@Data
@NoArgsConstructor

public class WebService {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long serviceId;
    private String serviceName;
    private Date startDate;
    private Date endDate;
    private Date renewalDate;
    private Enum serviceStatus;
    private double price;

    public WebService(String serviceName, Date startDate, Date endDate, Date renewalDate, Enum serviceStatus, double price) {
        this.serviceName = serviceName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.renewalDate = renewalDate;
        this.serviceStatus = serviceStatus;
        this.price = price;
    }
}
