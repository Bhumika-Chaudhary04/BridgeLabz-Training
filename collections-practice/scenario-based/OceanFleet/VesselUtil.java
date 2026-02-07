package OceanFleet;

import java.util.*;

public class VesselUtil {

	private List<Vessel> vesselList = new ArrayList<>();

	// Getter and Setter
	public List<Vessel> getVesselList() {
		return vesselList;
	}

	public void setVesselList(List<Vessel> vesselList) {
		this.vesselList = vesselList;
	}

	// Requirement 1: Add vessel
	public void addVesselPerformance(Vessel vessel) {
		vesselList.add(vessel);
	}

	// Requirement 2: Get vessel by ID (case-sensitive)
	public Vessel getVesselById(String vesselId) {
		for (Vessel vessel : vesselList) {
			if (vessel.getVesselId().equals(vesselId)) {
				return vessel;
			}
		}
		return null;
	}

	// Requirement 3: Get high performance vessels
	public List<Vessel> getHighPerformanceVessels() {

		List<Vessel> result = new ArrayList<>();
		double maxSpeed = 0;

		for (Vessel vessel : vesselList) {
			if (vessel.getAverageSpeed() > maxSpeed) {
				maxSpeed = vessel.getAverageSpeed();
			}
		}

		for (Vessel vessel : vesselList) {
			if (vessel.getAverageSpeed() == maxSpeed) {
				result.add(vessel);
			}
		}

		return result;
	}
}
