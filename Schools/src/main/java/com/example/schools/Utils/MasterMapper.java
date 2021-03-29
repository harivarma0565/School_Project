package com.example.schools.Utils;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public abstract class MasterMapper<V, D> {
	public abstract V convertEntity(D dto);

	public abstract D convertVO(V vo);

	public List<V> convertEntity(List<D> dtos) {

		return dtos.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}

	public List<D> convertVO(List<V> vos) {

		return vos.stream().map(v -> convertVO(v)).collect(Collectors.toList());
	}

	public Optional<V> convertEntity(Optional<D> optionaldto) {

		if (optionaldto.isPresent()) {
			return Optional.of(convertEntity(optionaldto.get()));
		}
		return Optional.empty();
	}

	public Optional<D> convertVO(Optional<V> optionalvO) {

		if (optionalvO.isPresent()) {
			return Optional.of(convertVO(optionalvO.get()));
		}
		return Optional.empty();
	}

	public <T> void funPoint(T value, Consumer<T> consumer) {
		if (value != null) {
			consumer.accept(value);
		}
	}

}
