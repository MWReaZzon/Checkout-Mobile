package ua.nure.myapplication.api.models

import android.view.inspector.IntFlagMapping

class WorkInFacility(
    val Work: Work,
    val FacilityName: String,
    val FacilityType: String
)

class Work(
    val workID:Int,
    val facilityID:Int,
    val userID:Int,
    val position: String,
    val currentPlace: Place?,
    val isAdmin: Boolean)

class Place (
    val placeID: Int,
    val name: String,
    val address: String,
    val schedules: List<Schedule>
)

class Schedule (
    scheduleID: Int,
    intervalMin: Int,
    disease: Disease
)

class Disease (
    diseaseID: Int,
    name: String,
    description: String
)