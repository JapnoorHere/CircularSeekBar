# CircularSeekBar

This repositor contains circular seek bar that we can use with Music.

Watch tutorial on my YT channel -> https://youtu.be/fD_rubJLsHY

Add this dependency to build.gradle(module :app) ->

dependencies{

      implementation 'me.tankery.lib:circularSeekBar:1.4.2'

}

Add this line in settings.gradle -> jcenter()


Here are some attributes that you can use : 


app:cs_circle_style = "butt|round|square"

app:cs_progress = "integer"

app:cs_max = "integer"

app:cs_negative_enabled = "boolean"

app:cs_move_outside_circle = "boolean"

app:cs_maintain_equal_circle = "boolean"

app:cs_use_custom_radii = "boolean"

app:cs_lock_enabled = "boolean"

app:cs_circle_x_radius = "dimension"

app:cs_circle_y_radius = "dimension"

app:cs_circle_stroke_width = "dimension"

app:cs_disable_pointer = "boolean"

app:cs_pointer_stroke_width = "dimension"

app:cs_pointer_halo_width = "dimension"

app:cs_pointer_halo_border_width = "dimension"

app:cs_circle_fill = "color"

app:cs_circle_color = "color"

app:cs_circle_progress_color = "color"

app:cs_pointer_color = "color"

app:cs_pointer_halo_color = "color"

app:cs_pointer_halo_color_ontouch = "color"

app:cs_pointer_alpha_ontouch = "integer"

app:cs_pointer_angle = "float"

app:cs_start_angle = "float"

app:cs_end_angle = "float"

app:cs_disable_progress_glow = "boolean"

app:cs_hide_progress_when_empty = "boolean"


Hope it helps you!
