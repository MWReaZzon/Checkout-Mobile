package ua.nure.myapplication.adapters

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ua.nure.myapplication.R
import ua.nure.myapplication.api.models.WorkInFacility
import ua.nure.myapplication.helpers.isDeadlinePassed


class WorksInFacilityAdapter(
    private val context: Context,
    val WorksInFacility: List<WorkInFacility>
) :
    RecyclerView.Adapter<WorksInFacilityAdapter.EventsViewHolder>() {

    class EventsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvPosition: TextView = view.findViewById(R.id.work_position)
        val tvFacility: TextView = view.findViewById(R.id.work_facility)
        val ivLocation: ImageView = view.findViewById(R.id.work_location)
        val ivIsAdmin: ImageView = view.findViewById(R.id.work_is_admin)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventsViewHolder {
        val view: View = LayoutInflater.from(context).inflate(
            R.layout.items_item, parent,
            false
        )
        return EventsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return WorksInFacility.size
    }

    override fun onBindViewHolder(holder: EventsViewHolder, position: Int) {
        val WorkInFacility = WorksInFacility[position]

        holder.tvPosition.text = WorkInFacility.Work.position;
        holder.tvFacility.text = WorkInFacility.FacilityName;
        if(WorkInFacility.Work.isAdmin)
            holder.ivIsAdmin.visibility = View.VISIBLE;
        if(WorkInFacility.Work.currentPlace != null)
            holder.ivLocation.setColorFilter(R.color.successColor)
        holder.ivLocation.setOnClickListener {
            //TODO Change location.
        }
    }
}