select actor_id,director_id 
From ActorDirector
Group by actor_id,director_id
having count(*)>=3; 