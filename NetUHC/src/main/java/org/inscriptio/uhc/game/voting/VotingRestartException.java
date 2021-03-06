package org.inscriptio.uhc.game.voting;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public final class VotingRestartException extends Exception {
    private final VotingRestartReason restartReason;
}
