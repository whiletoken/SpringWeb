package org.example.dao;

import org.example.dto.NeoMap;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author neo
 * @since 2022-10-26
 */
public interface NeoMapMapper {

    List<NeoMap> listAll();

}
